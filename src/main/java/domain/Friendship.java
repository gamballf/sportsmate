package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class Friendship extends DomainEntity{	
	
	//Constructors----------------------------------------------------------------------
	public Friendship()
	{
		super();
	}
	
	
	//Attributes-------------------------------------------------------------------------
	private Date data;

	@NotNull
	@Past
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	public Date getData() 
	{
		return data;
	}

	public void setData(Date data) 
	{
		this.data = data;
	}	
		
	//Relationships-------------------------------------------------------------------------
	private User user;
	private User userFriend;

	@Valid
	@NotNull
	@ManyToOne(optional=false)
	public User getUser() 
	{
		return user;
	}

	public void setUser(User user) 
	{
		this.user = user;
	}

	@Valid
	@NotNull
	@ManyToOne(optional=false)
	public User getUserFriend() 
	{
		return userFriend;
	}

	public void setUserFriend(User userFriend) 
	{
		this.userFriend = userFriend;
	}
	
	
	
}
