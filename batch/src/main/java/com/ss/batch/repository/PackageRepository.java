package com.ss.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ss.batch.entity.PackageEntity;

public interface PackageRepository extends 
			JpaRepository<PackageEntity, Long>{

}
