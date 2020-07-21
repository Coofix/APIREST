package com.cursos.APIREST.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.cursos.APIREST.models.Curso;
import org.springframework.data.annotation.Id;

public interface CursoRepository extends JpaRepository<Curso, Id>{

	Curso findById(int id);
}
