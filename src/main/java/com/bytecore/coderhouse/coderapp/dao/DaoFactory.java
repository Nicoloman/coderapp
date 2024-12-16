package  com.bytecore.coderhouse.coderapp.dao;

import org.springframework.stereotype.Service;

import com.bytecore.coderhouse.coderapp.entities.Alumno;
import com.bytecore.coderhouse.coderapp.entities.Curso;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;




@Service
public class DaoFactory {


    @PersistenceContext
    private EntityManager em;
    

    @Transactional
	public void persistirAlumno(Alumno alumno) {
		em.persist(alumno);
	}

	@Transactional
	public void persistirCurso(Curso curso) {
		em.persist(curso);
	}
}
