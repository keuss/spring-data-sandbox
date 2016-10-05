package com.keuss.sandbox.springdata.repositories;

import com.keuss.sandbox.springdata.entities.PP;

import javax.transaction.Transactional;

/**
 * Created by galloisg on 05/10/2016.
 */
@Transactional
public interface PPRepository extends ThirdpartyBaseRepository<PP> {
}
