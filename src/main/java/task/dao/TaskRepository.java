package task.dao;

import org.springframework.data.repository.CrudRepository;

import task.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{

}
