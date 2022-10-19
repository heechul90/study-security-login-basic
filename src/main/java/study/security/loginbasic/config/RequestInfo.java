package study.security.loginbasic.config;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class RequestInfo {

    private LocalDateTime loginTime;
    private String remoteId;
    private String sessionId;
}
