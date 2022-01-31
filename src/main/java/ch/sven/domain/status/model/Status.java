package ch.sven.domain.status.model;

import ch.sven.domain.common.Model;
import lombok.Data;

@Data
public class Status extends Model {

    private String statusName;
    private String statusDescription;
}
