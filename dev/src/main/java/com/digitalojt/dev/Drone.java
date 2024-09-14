package com.digitalojt.dev;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Drone {
  private String name;
  private Date createdAt;
}
