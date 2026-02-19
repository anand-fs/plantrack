package com.plantrack.backend.service;

import com.plantrack.backend.model.Report;

import java.util.List;

public interface ReportService {

    public Report generateDepartmentReport(String departmentName);
    public List<Report> getReportsByDepartment(String department);

}