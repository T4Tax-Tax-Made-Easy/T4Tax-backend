package org.shan.t4taxbackendv1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailRequest {
    private String name;
    private String subject;
    private String body;
    private String personalEmail;
    private String phone;

}
