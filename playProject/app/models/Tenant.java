package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Tenant extends Model {

	@Id
	public long id;
	
	public boolean claimsRecycling;
}
