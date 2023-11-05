package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExpirationDate {
    private String date;
    private Integer timezoneType;
    private String timezone;
}
