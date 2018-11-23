package ru.artbmstu.geekmarket.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.artbmstu.geekmarket.entities.Manufacturer;

public interface ManufacturerRepository extends CrudRepository<Manufacturer, Long> {
}
