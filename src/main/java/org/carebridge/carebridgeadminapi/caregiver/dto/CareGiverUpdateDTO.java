package org.carebridge.carebridgeadminapi.caregiver.dto;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class CareGiverUpdateDTO {

    private String cgname;
    private int cgage;
    private String cgphone;
    private String cgemail;
    private String cgpw;
}
