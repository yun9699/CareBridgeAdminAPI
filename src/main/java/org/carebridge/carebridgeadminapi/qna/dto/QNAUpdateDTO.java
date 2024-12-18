package org.carebridge.carebridgeadminapi.qna.dto;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
@Getter
public class QNAUpdateDTO {

    private Long qno;
    private String qtitle;
    private String qcontent;
    private boolean checkAnswer;

    private String cgemail;
    private String cgname;
    private String ctemail;
    private String ctname;

    private String qanswer;

    private LocalDateTime regDate;
    private LocalDateTime modDate;
}
