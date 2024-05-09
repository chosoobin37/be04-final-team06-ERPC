package com.cineverse.erpc.notice.board.service;

import com.cineverse.erpc.notice.board.aggregate.entity.NoticeBoard;
import com.cineverse.erpc.notice.board.dto.NoticeBoardDTO;
import com.cineverse.erpc.notice.board.repository.NoticeBoardRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PatchMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NoticeBoardServiceImpl implements NoticeBoardService {

    private final ModelMapper modelMapper;
    private final NoticeBoardRepository noticeBoardRepository;

    @Autowired
    public NoticeBoardServiceImpl(ModelMapper modelMapper, NoticeBoardRepository noticeBoardRepository) {
        this.modelMapper = modelMapper;
        this.noticeBoardRepository = noticeBoardRepository;
    }

    @Override
    @Transactional
    public NoticeBoard registNotice(NoticeBoardDTO noticeDTO) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String registDate = format.format(date);
        noticeDTO.setNoticeDate(registDate);

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        NoticeBoard newNotice = modelMapper.map(noticeDTO, NoticeBoard.class);
        newNotice = noticeBoardRepository.save(newNotice);

        return newNotice;
    }

    @Override
    @Transactional
    public NoticeBoard modifyNotice(Long noticeId, NoticeBoardDTO notice) {
        Optional<NoticeBoard> optionalNoticeBoard = noticeBoardRepository.findById(noticeId);

        if (optionalNoticeBoard.isEmpty()) {
            throw new EntityNotFoundException("존재하지 않는 공지사항입니다.");
        }

        NoticeBoard noticeBoard = optionalNoticeBoard.get();

        if (noticeBoard.getNoticeTitle() != null) {
            noticeBoard.setNoticeTitle(notice.getNoticeTitle());
        }
        if (noticeBoard.getNoticeContent() != null) {
            noticeBoard.setNoticeContent(notice.getNoticeContent());
        }

        return noticeBoardRepository.save(noticeBoard);
    }

    @Override
    public NoticeBoard deleteNotice(Long noticeId) {
        Optional<NoticeBoard> optionalNoticeBoard = noticeBoardRepository.findById(noticeId);

        if (optionalNoticeBoard.isEmpty()) {
            throw new EntityNotFoundException("존재하지 않는 공지사항입니다.");
        }

        NoticeBoard noticeBoard = optionalNoticeBoard.get();

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String deleteDate = format.format(date);
        noticeBoard.setNoticeDeleteDate(deleteDate);

        return noticeBoardRepository.save(noticeBoard);
    }

    @Override
    public List<NoticeBoard> findNoticeList() {
        List<NoticeBoard> noticeBoardList = noticeBoardRepository.findByNoticeDeleteDateIsNullOrderByNoticeIdDesc();

        return noticeBoardList.stream().map(notice -> modelMapper
                        .map(notice, NoticeBoard.class))
                        .collect(Collectors.toList());
    }

    @Override
    public NoticeBoardDTO findNoticeById(Long noticeId) {
        NoticeBoard noticeBoard=noticeBoardRepository.findById(noticeId)
                .orElseThrow(EntityNotFoundException::new);

        noticeBoardRepository.save(noticeBoard);
        NoticeBoardDTO noticeBoardDTO = modelMapper.map(noticeBoard, NoticeBoardDTO.class);

        return noticeBoardDTO;
    }
}
