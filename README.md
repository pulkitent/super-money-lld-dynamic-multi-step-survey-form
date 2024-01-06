### Dynamic Multi-Step Survey Form

## Description

Develop a dynamic multi-step survey form application that allows users to complete the survey in multiple sessions,
resuming where they left off. The form should be able to branch based on user input and provide a preview feature at any
stage.

## Key Requirements

1. Multi-Step Form with Conditional Branching: The survey should consist of multiple steps/pages. Based on the
   responses, the next set of questions may vary (conditional branching).
2. Save and Resume: Users may not complete the survey in one go. Implement a feature to save the current state of the
   survey so that the user can resume from the same point later.
3. Preview Feature: At any point, the user should be able to preview the responses provided so far.
4. Validation: Include necessary input validations to ensure data integrity.
5. New surveys onboarding: Admin should be able to onboard new surveys.
6. Survey life cycle: Surveys should have a life cycle. Post expiry users shouldn’t be able to see or fill the survey.
7. Question-Answer format with skip functionality: Assume every question in the survey will have few options as possible
   answers. Users will be choosing one of the answers or can skip the question altogether.

## Advanced Features (Optional)

1. Analytics: Generate a summary or analytics of the survey responses after submission.
   Survey level analytics
   Page (within survey) level analytics
   Question / Answer level analytics