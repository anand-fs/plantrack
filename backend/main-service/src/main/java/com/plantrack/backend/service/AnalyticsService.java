package com.plantrack.backend.service;

import com.plantrack.backend.dto.*;

import java.util.List;

public interface AnalyticsService {

    AnalyticsDTO getUserAnalytics(Long userId);

    DashboardStatsDTO getDashboardStats();

    /**
     * Get departmental insights - analyze performance by department
     */
    List<DepartmentalInsightsDTO> getDepartmentalInsights();

    /**
     * Get velocity metrics for a specific user
     */
    VelocityMetricsDTO getUserVelocity(Long userId);

    /**
     * Get velocity metrics for all users (team performance)
     */
    List<VelocityMetricsDTO> getAllUsersVelocity();

    // ============================================================
    // GAMIFICATION METHODS
    // ============================================================

    /**
     * Calculate performance score for a user with proper department-wise ranking
     */
    PerformanceScoreDTO calculatePerformanceScore(Long userId, String departmentFilter);

    /**
     * Get gamified velocity metrics with badges and rankings
     */
    GamifiedVelocityDTO getGamifiedVelocity(Long userId, String departmentFilter);

    /**
     * Calculate badges for a user (department-aware)
     */
    List<BadgeDTO> calculateBadges(Long userId);

    /**
     * Get leaderboard entries
     */
    List<LeaderboardEntryDTO> getLeaderboard(String metricType, String departmentFilter, int limit);

    /**
     * Get gamified velocity for all users with filtering and proper ranking
     */
    List<GamifiedVelocityDTO> getAllGamifiedVelocity(String departmentFilter, String searchQuery,
                                                     Double minCompletionRate, Double maxCompletionRate,
                                                     Integer minTasks, Integer maxTasks,
                                                     String performanceTier, String sortBy, String sortOrder);

    /**
     * Get all available departments
     */
    List<String> getAllDepartments();
}