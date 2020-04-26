package org.sid.hospital.dao;


import org.sid.hospital.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long>{
	public Page<Patient> findByNameContains(String kw,Pageable pageable);
	
}
