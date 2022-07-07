package ru.bigmaestrov.opencode.repos;

import org.springframework.data.repository.CrudRepository;
import ru.bigmaestrov.opencode.domain.WebForm;

import java.util.List;

    public interface WebFormRepo extends CrudRepository<WebForm, Long> {

        List<WebForm> findByTag(String tag);

    }

