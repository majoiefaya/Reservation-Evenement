package com.gestionReEvenement.GestionReservationEvenement.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestionReEvenement.GestionReservationEvenement.Models.Admin;
import com.gestionReEvenement.GestionReservationEvenement.Services.AdminService;


@RestController
@RequestMapping("/Admin")
@CrossOrigin("*")
public class AdminController {

	@Autowired
	public AdminService adminService;
	
	@RequestMapping(value="/ajouterAdmin",method= RequestMethod.POST,headers="accept=Application/json")
	public Admin save(@RequestBody Admin admin) {
		try {
			admin=this.adminService.saveAdmin(admin);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return admin;
		
	}
	
	@RequestMapping(value="/getAllAdmins",method= RequestMethod.GET,headers="accept=Application/json")
	public List<Admin> getAll() {
		List<Admin> admins=new ArrayList<>();
		try {
			admins=this.adminService.getAllAdmin();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return admins;
		
	}
	
	@RequestMapping(value="/updateAdmin",method= RequestMethod.PUT,headers="accept=Application/json")
	public Admin update(@RequestBody Admin admin) {
		try {
			admin=this.adminService.updateAdmin(admin);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return admin;
		
	}
	
	@RequestMapping(value = "/deleteAdmin", method =RequestMethod.DELETE)
	public String DeleteByObject(@RequestBody Admin admin){
		 return this.adminService.deleteAdminByObject(admin);
	}

	
	@RequestMapping(value = "/deleteAdmin/{id}", method =RequestMethod.DELETE)
	public String DeleteById(@PathVariable("id") long id){
		 return this.adminService.deleteAdminById(id);
	}
	
	
	
	@RequestMapping(value = "/findAdminById/{id}", method =RequestMethod.GET)
	public Admin findById(@PathVariable("id") long id){
		 return this.adminService.findAdminById(id);
	}

	
	
	@RequestMapping(value = "/findAdminByNomAdmin", method =RequestMethod.GET)
	public Admin findByNomAdmin(@RequestBody String NomAdmin){
		 return this.adminService.findAdminByNom(NomAdmin);
	}
	
}
