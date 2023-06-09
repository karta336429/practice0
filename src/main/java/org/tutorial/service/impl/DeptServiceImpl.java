package org.tutorial.service.impl;

import java.util.List;

import org.tutorial.dao.DeptDAO;
import org.tutorial.dao.impl.DeptDAOImpl;
import org.tutorial.model.DeptDO;
import org.tutorial.model.EmpDO;
import org.tutorial.service.DeptService;

public class DeptServiceImpl implements DeptService {

    private DeptDAO dao;

    public DeptServiceImpl() {
        dao = new DeptDAOImpl();
    }

    public List<DeptDO> getAll() {
        return dao.getAll();
    }

    public DeptDO getOneDept(Integer deptno) {
        return dao.findByPrimaryKey(deptno);
    }

    public DeptDO update(Integer deptno, String dname, String loc) {
        DeptDO deptDO = new DeptDO();
        deptDO.setDeptno(deptno);
        deptDO.setDname(dname);
        deptDO.setLoc(loc);
        dao.update(deptDO);
        return dao.findByPrimaryKey(deptno);
    }

    public List<EmpDO> getEmpsByDeptno(Integer deptno) {
        return dao.getEmpsByDeptno(deptno);
    }

    public void deleteDept(Integer deptno) {
        dao.delete(deptno);
    }

}
