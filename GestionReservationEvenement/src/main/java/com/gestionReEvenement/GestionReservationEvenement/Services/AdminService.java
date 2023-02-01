package com.gestionReEvenement.GestionReservationEvenement.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestionReEvenement.GestionReservationEvenement.Models.Admin;

@Service
public interface AdminService {
	
	
	public Admin saveAdmin(Admin admin);
	
	public Admin updateAdmin(Admin  admin);
	
	public String deleteAdminById(Long id);
	
	public String deleteAdminByObject(Admin admin);

	public List<Admin> getAllAdmin();

	public Admin findAdminById(Long id) ;
	
	public Admin findAdminByNom(String nom);

}
