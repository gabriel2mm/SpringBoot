package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.Aluno;
import Service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class ControllerAluno {

	@Autowired
	private AlunoService service;

	@RequestMapping("/all")
	public List<Aluno> Alunos(){
		return service.findAll();
	}
}
