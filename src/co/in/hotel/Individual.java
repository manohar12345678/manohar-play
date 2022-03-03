package co.in.hotel;

public class Individual implements Person,Task{

    private PersonType personType;
    private Task task;

    public Individual(PersonType personType, Task task) {
        this.personType = personType;
        this.task = task;
    }

    @Override
    public PersonType getPersonType() {
        return personType;
    }

    public Task getTask() {
        return task;
    }
}
