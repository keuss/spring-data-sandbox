package com.keuss.sandbox.springdata.repositories;

import com.keuss.sandbox.springdata.entities.Thirdparty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by galloisg on 05/10/2016.
 */
@NoRepositoryBean
public interface ThirdpartyBaseRepository<T extends Thirdparty>
        extends CrudRepository<T, Integer> {

        /*JpaRepository will have all the functions of CrudRepository and PagingAndSortingRepository. So if you don't need
        the repository to have the functions provided by JpaRepository and PagingAndSortingRepository , use CrudRepository.*/

        public T findByMarket(String market);

}
