package com.plantrack.backend.service;

import com.plantrack.backend.dto.*;


import java.util.List;


public interface AnalyticsService {

    public AnalyticsDTO getUserAnalytics(Long userId);

    public DashboardStatsDTO getDashboardStats();

    public List<DepartmentalInsightsDTO> getDepartmentalInsights();
  
    public VelocityMetricsDTO getUserVelocity(Long userId);
    public List<VelocityMetricsDTO> getAllUsersVelocity();
    public PerformanceScoreDTO calculatePerformanceScore(Long userId, String departmentFilter);

    public GamifiedVelocityDTO getGamifiedVelocity(Long userId, String departmentFilter);
   
    public List<BadgeDTO> calculateBadges(Long userId); 

    public List<LeaderboardEntryDTO> getLeaderboard(String metricType, String departmentFilter, int limit);
  
    public List<GamifiedVelocityDTO> getAllGamifiedVelocity(String departmentFilter, String searchQuery,
                                                             Double minCompletionRate, Double maxCompletionRate,
                                                             Integer minTasks, Integer maxTasks,
                                                             String performanceTier, String sortBy, String sortOrder); 
   
    public List<String> getAllDepartments();
}