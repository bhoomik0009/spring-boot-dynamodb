package org.mytoshika.repository;

import org.mytoshika.model.Hotel;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EnableScan
public interface HotelRepository extends CrudRepository<Hotel, String>, CustomHotelRepository {
    List<Hotel> findAllByName(String name);
}
