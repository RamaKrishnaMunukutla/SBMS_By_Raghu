package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.model.Project;

public interface ProjectRepository 
	extends JpaRepository<Project, Integer> {

}
