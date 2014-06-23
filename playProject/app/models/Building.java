package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Building extends Model{

	@Id
	public long id;
	
	@Required
	public String address;
	
	public Integer zipcode;
	
	@OneToMany
	public Tenant tenant;
}
