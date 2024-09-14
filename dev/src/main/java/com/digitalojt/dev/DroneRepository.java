package com.digitalojt.dev;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class DroneRepository {
  private final JdbcTemplate jdbcTemplate;

	public List<Drone> getAll() {
		String sql = "select name,created_at from drone";
		List<Map<String, Object>> result = jdbcTemplate.queryForList(sql);
		List<Drone> list = new ArrayList<>();
		for (Map<String, Object> r : result) {
			list.add(new Drone(
				(String) r.get("name"),
				(Date) r.get("created_at")));
    }
		return list;
	}
}