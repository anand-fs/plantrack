package com.plantrack.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.plantrack.backend.model.Report;
import com.plantrack.backend.service.ReportService;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    // Generate a new report for a department
    // POST /api/reports/generate?department=IT
    @PostMapping("/generate")
    public ResponseEntity<Report> generateReport(@RequestParam String department) {
        Report generatedReport = reportService.generateDepartmentReport(department);
        return ResponseEntity.status(HttpStatus.CREATED).body(generatedReport);
    }

    // Get history of reports for a department
    // GET /api/reports?department=IT
    @GetMapping
    public ResponseEntity<List<Report>> getReports(@RequestParam String department) {
        List<Report> reports = reportService.getReportsByDepartment(department);
        return ResponseEntity.ok(reports);
    }
}