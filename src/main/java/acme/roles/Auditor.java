
package acme.roles;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.entities.audit.Audit;
import acme.framework.data.AbstractRole;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Auditor extends AbstractRole {

	protected static final long	serialVersionUID	= 1L;

	@OneToMany
	protected List<Audit> 		audits;
	
	@NotBlank
	@Length(max = 75)
	protected String			firm;

	@NotBlank
	@Length(max = 25)
	protected String			professionalId;

	@NotBlank
	@Length(max = 100)
	protected String      certifications;

	@URL
	protected String 			furtherInformation;


}
