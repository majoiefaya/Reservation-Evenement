package com.gestionReEvenement.GestionReservationEvenement.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionReEvenement.GestionReservationEvenement.Models.Admin;
import com.gestionReEvenement.GestionReservationEvenement.Repositories.AdminRepository;

import com.gestionReEvenement.GestionReservationEvenement.Services.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	public AdminRepository adminRepository;
	
	@Override
	public Admin saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return this.adminRepository.save(admin);
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return this.adminRepository.save(admin);
	}

	@Override
	public String deleteAdminById(Long id) {
		// TODO Auto-generated method stub
		this.adminRepository.deleteById(id);
		return  "Administrateur Supprimé avec succes !";
	}

	@Override
	public String deleteAdminByObject(Admin admin) {
		// TODO Auto-generated method stub
		this.adminRepository.deleteById(admin.getId());
		return "Administrateur Supprimé avec succes !";
	}

	@Override
	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		return this.adminRepository.findAll();
	}

	@Override
	public Admin findAdminById(Long id) {
		// TODO Auto-generated method stub
		return this.adminRepository.findById(id).orElse(null);
	}

	@Override
	public Admin findAdminByNom(String nom) {
		// TODO Auto-generated method stub
		return this.adminRepository.findBynom(nom);
	}

}
