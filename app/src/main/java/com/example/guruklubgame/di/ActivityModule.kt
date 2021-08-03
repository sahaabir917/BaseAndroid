package com.gmpire.guruklub.di

import com.example.guruklubgame.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityModule {

//    @ContributesAndroidInjector
//    internal abstract fun contributeSplashActivity(): SplashActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeLoginActivity(): LoginActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun QuestionShareActivity(): QuestionShareActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun LeaderBoardActivity(): LeaderBoardActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun ErrorActivity(): ErrorActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun FavouriteActivity(): FavouriteActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeInfoCenterActivity(): InfoCenterActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeHelpAndSupportActivity(): HelpAndSupportActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun RelatedVideoActivity(): RelatedVideoActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeSubjectBasedPerformanceActivity(): SubjectBasedPerformanceActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeViewSolutionsActivity(): ViewSolutionsActivity
//
    @ContributesAndroidInjector
    internal abstract fun contributeMainActivity(): MainActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun ResetPasswordActivity(): ResetPasswordActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun PhoneVerificationActivity(): PhoneVerificationActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun TermsConditionActivity(): TermsConditionActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun GameHelpActivity(): ContentActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun RegistrationActivity(): RegistrationActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun EmailVerificationActivity(): EmailVerificationActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun ProfileSetupActivity(): ProfileSetupActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun LibraryActivity(): LibraryActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun HowToGetCoinActivity(): HowToGetCoinActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun GameActivity(): GameActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun GameResultActivity(): GameResultActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun ProfileActivity(): ProfileActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun QuestionDetailsActivity(): QuestionDetailsActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun QuestionAddActivity(): QuestionAddActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun NotificationActivity(): NotificationActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun QuestionAddNextActivity(): QuestionAddNextActivity
//
//
//    @ContributesAndroidInjector
//    internal abstract fun LeaderDetailsActivity(): LeaderDetailsActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun NewsDetailsActivity(): NewsDetailsActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun SuccessOrFailActivity(): SuccessOrFailActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun PerformanceHistoryActivity(): PerformanceHistoryActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeHomeFragment(): HomeFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeLibraryFragment(): LibraryFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeGameFragment(): GameFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun StudyFragment(): StudyFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun QuestionsFragment(): QuestionsFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun ProfileFragment(): ProfileFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun LeaderBoardFragment(): LeaderBoardFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun ErrorFragment(): ErrorFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun FavaouriteFragment(): FavouriteFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun NewsFragment(): NewsFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun PopularFragment(): PopularFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun PreviousQuestionBatchFragment(): PreviousQuestionBatchFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun BatchQuestionActivity(): BatchQuestionActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeNotificationFragment(): NotificationFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeForgetPasswordActivity(): ForgetPasswordActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeModelTestActivity(): ModelTestActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeNotificationDetailsActivity(): NotificationDetailsActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeSettingsActivity(): SettingsActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeCategoryAndSubjectSelectionActivity(): CategoryAndSubjectSelectionActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeQuestionSearchActivity(): QuestionSearchActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeQuestionSearchFragment(): QuestionSearchFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeProfileMainFragment(): ProfileMainFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeInfoCentreFragment(): InfoCentreFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeHelpAndSupportFragment(): HelpAndSupportFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeSettingsFragment(): SettingsFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeLibraryFragmentNew(): LibraryFragmentNew
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeSingleVideoActivity(): SingleVideoActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeGameLevelActivity(): GameLevelActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeHeartAddActivity(): HeartAddActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeLevelUpActivity(): GameLevelUpDialog
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeGameSettingActivity(): GameSettingDialog
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeSubscribeActivity(): SubscribeDialog
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeGameLevelQuestionActivity(): GameLevelQuestionActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeGameRuleDialogFragment(): GameLevelInfoDialog
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeGameLevelOverDialogFragment(): GameLevelOverDialog
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeGameChallengeFragment(): GameChallengeDialog
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeGameChallengeActivity(): GameChallengeActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeHeartChallengeSuccessDialogFragment(): HeartChallengeSuccessDialogFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeInviteFriendPromoCodeDialog(): InviteFriendPromoCodeDialog
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeGameChallengeFailedDialog(): GameChallengeFailedDialog
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeAllVideosActivity(): AllVideosActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeAddVideoActivity(): AddVideoActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeAddVideoNextActivity(): AddVideoNextActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeAddVideoSuccessFull(): AddVideoSuccessFull
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeYoutbeActivity(): YoutubeActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeUpdateProfileDialog(): UpdateProfileDialog
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeAllLibrarySubject(): AllLibrarySubject
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeNewsDetailsGestureDialog(): NewsDetailsGestureDialog
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeDashBoardFragment(): DashboardFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun contributePlayWithFriendActivity(): PlayWithFriendActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributePlayWithFriendWinnerActivity(): PlaywithFriendWinnerActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeFriendRequestFragment(): FriendRequestFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeAddFriendFragment(): AddFriendFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeMyFriendFragment(): MyFriendFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeRequestFriendFragment(): RequestFriendFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeRecivedPendingFriendRequest(): RecivedPendingFriendRequest
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeFriendRequestActivity(): FriendRequestActivity
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeHeartChooseDialog(): HeartChooseDialog
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeNoticeDetailsActivity(): NoticeDetailsActivity

}