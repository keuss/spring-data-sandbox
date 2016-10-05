package com.keuss.sandbox.springdata.repositories;

import com.keuss.sandbox.springdata.entities.Thirdparty;

import javax.transaction.Transactional;

/**
 * Created by galloisg on 05/10/2016.
 */
@Transactional
public interface ThirdpartyRepository extends ThirdpartyBaseRepository<Thirdparty> {
}
