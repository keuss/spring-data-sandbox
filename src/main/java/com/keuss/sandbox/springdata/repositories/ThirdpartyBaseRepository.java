package com.keuss.sandbox.springdata.repositories;

import com.keuss.sandbox.springdata.entities.Thirdparty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by galloisg on 05/10/2016.
 */
@NoRepositoryBean
public interface ThirdpartyBaseRepository<T extends Thirdparty>
        extends CrudRepository<T, Long> {

        public T findByMarket(String market);

}
