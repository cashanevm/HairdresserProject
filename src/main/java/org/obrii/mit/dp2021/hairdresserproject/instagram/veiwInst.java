///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package org.obrii.mit.dp2021.hairdresserproject.instagram;
//
//import java.io.File;
//import java.io.IOException;
//import org.brunocvcunha.instagram4j.Instagram4j;
//import org.brunocvcunha.instagram4j.requests.InstagramGetInboxRequest;
//import org.brunocvcunha.instagram4j.requests.InstagramGetUserFollowersRequest;
//import org.brunocvcunha.instagram4j.requests.InstagramPostCommentRequest;
//import org.brunocvcunha.instagram4j.requests.InstagramSearchUsernameRequest;
//import org.brunocvcunha.instagram4j.requests.InstagramUploadPhotoRequest;
//import org.brunocvcunha.instagram4j.requests.InstagramUserFeedRequest;
//import org.brunocvcunha.instagram4j.requests.payload.InstagramFeedItem;
//import org.brunocvcunha.instagram4j.requests.payload.InstagramFeedResult;
//import org.brunocvcunha.instagram4j.requests.payload.InstagramGetUserFollowersResult;
//import org.brunocvcunha.instagram4j.requests.payload.InstagramInboxResult;
//import org.brunocvcunha.instagram4j.requests.payload.InstagramInboxThread;
//import org.brunocvcunha.instagram4j.requests.payload.InstagramInboxThreadItem;
//import org.brunocvcunha.instagram4j.requests.payload.InstagramSearchUsernameResult;
//import org.brunocvcunha.instagram4j.requests.payload.InstagramUserSummary;
//
///**
// *
// * @author NEVM PC
// */
//public class veiwInst {
//    
//public static void main(String[] args) throws IOException {
//
//		Instagram4j instagram = Instagram4j.builder().username("nevm_work_dev").password("NOKIa2700").build();
//		instagram.setup();
//		instagram.login();
//
//		// получение информации о пользователе
//		InstagramSearchUsernameResult usernameResult = instagram.sendRequest(new InstagramSearchUsernameRequest("alexander_khaustov"));
//		System.out.println(usernameResult.getUser().biography);
//		System.out.println(usernameResult.getUser().username);
//		System.out.println(usernameResult.getUser().getFollower_count());
//
//		// получение подписчиков
////		InstagramGetUserFollowersResult followersResult = instagram.sendRequest(
////				new InstagramGetUserFollowersRequest(usernameResult.getUser().getPk()));
////		for (InstagramUserSummary user : followersResult.getUsers()) {
////			System.out.println(user.full_name + " " + user.pk);
////		}
//
//		// подписка/отписка
////		InstagramSearchUsernameResult githubResult = instagram.sendRequest(new InstagramSearchUsernameRequest("github"));
////		instagram.sendRequest(new InstagramFollowRequest(githubResult.getUser().getPk()));
////		instagram.sendRequest(new InstagramUnfollowRequest(githubResult.getUser().getPk()));
//
//		// получение постов
//		InstagramFeedResult postList = instagram.sendRequest(new InstagramUserFeedRequest(usernameResult.getUser().getPk()));
//		for(InstagramFeedItem post : postList.getItems()) {
//			System.out.println(post.user..url);
//                        System.out.println(post.caption.getText());
//			// написать комментарий
//			//instagram.sendRequest(new InstagramPostCommentRequest(post.getPk(), "Тестовый комментарий"));
//		}
//
//		// публикация поста
//		//instagram.sendRequest(new InstagramUploadPhotoRequest(new File("test.jpg"), "Пример поста, отправленного с использованием instagram4j"));
//
//		// чтение сообщений
////		InstagramInboxResult inbox = instagram.sendRequest(new InstagramGetInboxRequest());
////		for (InstagramInboxThread thread: inbox.getInbox().getThreads()) {
////			for (InstagramInboxThreadItem item : thread.getItems()) {
////				System.out.println(item.text);
////			}
////		}
//
//	}
//}
