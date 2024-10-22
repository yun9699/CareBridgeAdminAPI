package org.carebridge.carebridgeadminapi.faq.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.carebridge.carebridgeadminapi.faq.dto.FAQUpdateDTO;
import org.carebridge.carebridgeadminapi.faq.dto.FAQListDTO;
import org.carebridge.carebridgeadminapi.faq.mapper.FAQMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Log4j2
@Service
@RequiredArgsConstructor
public class FAQService {

    private final FAQMapper faqMapper;

    // FAQ 목록 조회
    public List<FAQListDTO> getList() {

        return faqMapper.getAllFAQs();
    }

    // FAQ 등록
    public void insertFAQ(FAQUpdateDTO faqUpdateDTO) {

        faqMapper.insertFAQ(faqUpdateDTO);
    }

    // FAQ 수정
    public void updateFAQ(FAQUpdateDTO faqUpdateDTO) {

        faqMapper.updateFAQ(faqUpdateDTO);
    }

    // FAQ 소프트 삭제
    public void softDeleteFAQ(long fno) {

        faqMapper.softDeleteFAQ(fno);
    }

    // FAQ 상세
    public FAQUpdateDTO getOne(long fno) {
        return faqMapper.getOne(fno);
    }
}