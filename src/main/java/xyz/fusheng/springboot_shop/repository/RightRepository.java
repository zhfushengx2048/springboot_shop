/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: RightRepository
 * Author:   25610
 * Date:     2020/2/18 12:14
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_shop.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.fusheng.springboot_shop.entity.Right;

import java.util.List;

@Repository
public interface RightRepository extends JpaRepository<Right, Integer> {

    @Override
    List<Right> findAll();

    List<Right> findAllByPid(int pid);

}
