# Onramp Android Take Home Project 

## Overview 🤖

Congratulations for making it this far in the interview process for the SiriusXM + Pandora Apprenticeship at Onramp! This project seeks to better inform the Onramp team of your experience with the Java, Kotlin, testing, and Android development. This is also designed to prepare you for your interview at SiriusXM + Pandora, as well

You will have seven days to complete this project. We expect those who have a moderate level of Android development experience to spend between 30 and 40 hours to design, implement, document, and submit the project to us. Depending on your level, it may take more or less time, so please plan accordingly.

**The project is due on [DUE DATE] at 9:00am PT/ 12:00pm ET**

#### Project Summary:
*   Total time available to complete: 7 days
*   Due date/time: [DUE DATE]
*   Expected development time to complete: 30 - 40 hours 
*   Required stack/tools: a computer with Android Studio

For this project, you will be writing tests within an existing application called Anki. You'll find more information on this project at the bottom of this README.


#### Android App Requirements

### // TODO What do we include here? Espresso, Kotlin, what else?
For this project, we want you to build an Android application that is one of the following: 
*   ?
*   ?
*   ?
*   ?
 

**Scope your features and functionality to what you can reasonably accomplish by the due date. Your application must include the following architectural requirements:**

### // TODO We need to figure out how to adjust this and what we're expecting them to use
*   Use of at least two [Activities](https://developer.android.com/guide/components/activities/intro-activities) and one [Fragment](https://developer.android.com/guide/fragments). 
*   Use of at least one [Service](https://developer.android.com/guide/components/services).
*   The usage of the [MVP](https://www.vogella.com/tutorials/AndroidArchitecture/article.html) architectural pattern.
*   Use of a [REST API](https://guides.codepath.com/android/consuming-apis-with-retrofit).
*   Usage of at least five UI components from the [Android Material Design Component Library](https://material.io/design/components/bottom-navigation.html).
*   The usage of data persistence like Android [Room](https://developer.android.com/training/data-storage/room).

**Note: you will need to detail where and how your Android App meets these requirements in your repository's README file when you submit your project.**

#### A Note on Researching and Plagiarism

You are actively encouraged to research the web, books, videos, or tutorials for this project. That said, we expect all code that is submitted to be your own (e.g. this project should **NOT** be completed with another person). That means that we expect each candidate to refrain from copying and/or pasting code into the project. If we find copied code in your project, we will have to disqualify you. We’ve included some suggested web and video resources at the end of this document.

## What we're looking for 🌟

### // TODO What factors are we assessing now? Code quality? Quality of logic within tests?
We will evaluate your project by assessing the overall strength and quality of the following five factors: 

#### UI Design

Android users expect your application to look and behave in a way that's consistently intuitive. Your Android application should utilize thoughtful [animations](https://material.io/design/motion/), [patterns](https://material.io/design/), [style](https://material.io/design/color/), [components](https://material.io/components) and [layouts](https://material.io/design/layout/understanding-layout.html) to create a highly usable user interface.

#### Architecture Pattern

An architecture pattern enables you to define a guide for how a piece of software should function, such that it can be scalable, maintainable, and testable. Common patterns for Android applications include [MVP](https://www.vogella.com/tutorials/AndroidArchitecture/article.html) (Model View Presenter), [MVC](https://medium.com/upday-devs/android-architecture-patterns-part-1-model-view-controller-3baecef5f2b6) (Model View Controller), and [MVVM](https://medium.com/@husayn.hakeem/android-by-example-mvvm-data-binding-introduction-part-1-6a7a5f388bf7) (Model View ViewModel).

**It is required that you leverage the MVP pattern within your Android app for this project.** Keep in mind the concept of [Separation of Concerns](https://developer.android.com/jetpack/guide).

#### Core Android Components

[Activities](https://developer.android.com/guide/components/activities/intro-activities), [Services](https://developer.android.com/guide/components/services), [Broadcast Receivers](https://developer.android.com/reference/android/content/BroadcastReceiver.html), and [Content Providers](https://developer.android.com/guide/topics/providers/content-providers.html) are four types of Android Application components, which are the essential building blocks of an Android app. Each serves a distinct purpose and has a distinct lifecycle that defines how the component is created and destroyed. 

The usage of Activities and Services are extremely common when implementing Android apps and are therefore **mandatory** to include in your project, however, the usage of a Broadcast Receiver and/or Content Provider is optional, depending on the app design.

#### Android Development Best Practices

It's important to subscribe to a set of best practices when designing and implementing an Android app. Be mindful of these widely accepted principles:

*   Keep your code [DRY](https://code.tutsplus.com/tutorials/3-key-software-principles-you-must-understand--net-25161) (don't repeat yourself). Also view this [Wikipedia article](https://en.wikipedia.org/wiki/Don%27t_repeat_yourself).
*   Maintain a [separation of concerns](https://developer.android.com/jetpack/guide) within your Android components.
*   Specify good [project structure](https://developer.android.com/studio/intro).

Using these principles will result in a high quality user experience while efficiently utilizing phone hardware resources and ensuring other developers can easily navigate through your code.

### // TODO maybe we could ask the applicants to describe what they decided to test and why they thought it was important to test that thing?
#### Android Application Description

As detailed above, each project submission must include a README file, which provides an overview of the Android application and details the app's overall MVP architecture as well as your design decisions. Screenshots of the Android app taken from the Android Studio emulator are also required. This task assesses the critical competency of communicating and documenting technical concepts.

#### Version Control

We expect you to attempt to use version control best practices in your project. We will evaluate this by looking at the frequency of commits, commit messages, and diffs. We don’t expect you to be a pro with git, but we do expect you to be able to commit frequently rather than committing everything all at once.

### // TODO we could probably remove this testing section all together since this project is going to be focused around testing
## What we are NOT Evaluating

**Testing**

Testing frameworks and strategies are intentionally **NOT** included within the rubric because we want you to dedicate your time to building a functional application (We do realize that UI and Android component testing are critical practices of Android Development, but this take home project prioritizes a focus on surfacing Kotlin/Android development proficiency).

### // TODO remove?
**Feature depth**

You won’t be earning extra points for having a bunch of features. Focus on creating a clean, simple application that addresses all of the requirements and is documented properly for submission.

## Submission Information 🚀

#### Submission Format

This repository will be your starting point. Please download (not clone or fork) this Github repository ([onramp-android-take-home](https://github.com/onramp-io/onramp-android-take-home)) and upload changes to a newly created repository. Once the Android application has been completed, you'll be submitting a link to the new repository you created. Prior to submitting your project, you should update the README file to provide the following information:

*   A high level architectural overview of your Android application. e.g. names, relationships and purposes of all components, including Activities, Services, Content Providers, Broadcast Receivers, etc. 
*   A brief description of any design patterns that you leveraged.
*   [Screenshots](https://developer.android.com/studio/debug/am-screenshot) of each Activity View and descriptions of the overall user flow.

#### Submission Deadline + Process

You must submit your project by **9:00am PT/12:00pm ET, on January 13, 2020 using [this form](https://docs.google.com/forms/d/e/1FAIpQLSdFBo328et9VHd04fFTZ7MRfIUD5le-jimyl0UccCs3IBYHoQ/viewform).** Be sure that your project is viewable by the Onramp team in a **public** repository (you can make it private after January 28, 2021).

Once you’ve submitted your project, you are expected to stop working on it. Any commits that occur after submission or the deadline will not be reviewed. 

### // TODO We'll need to adjust these resources to be more relevant around testing
## Additional Resources 📚

*   [Android Studio](https://developer.android.com/studio)
*   [Android Application Fundamentals](https://developer.android.com/guide/components/fundamentals)
*   [Design for Android Developers](https://developer.android.com/design)
*   [Android Material Design Component Library](https://material.io/design/components/bottom-navigation.html)
*   [Basic concepts of software architecture patterns in Android](https://android.jlelse.eu/basic-concepts-of-software-architecture-patterns-in-android-c76e53f46cba)



## AnkiDroid information

<p align="center">
<img src="docs/graphics/logos/banner_readme.png"/>
</p>

<a href="https://github.com/ankidroid/Anki-Android/releases"><img src="https://img.shields.io/github/v/release/ankidroid/Anki-Android" alt="release"/></a>
<a href="https://travis-ci.org/github/ankidroid/Anki-Android"><img src="https://img.shields.io/travis/ankidroid/Anki-Android" alt="build"/></a>
<a href="https://opencollective.com/ankidroid"><img src="https://img.shields.io/opencollective/all/ankidroid" alt="Open Collective backers and sponsors"/></a>
<a href="https://github.com/ankidroid/Anki-Android/issues"><img src="https://img.shields.io/github/commit-activity/m/ankidroid/Anki-Android" alt="commit-activity"/></a>
<a href="https://github.com/ankidroid/Anki-Android/network/members"><img src="https://img.shields.io/github/forks/ankidroid/Anki-Android" alt="forks"/></a>
<a href="https://github.com/ankidroid/Anki-Android/stargazers"><img src="https://img.shields.io/github/stars/ankidroid/Anki-Android" alt="stars"/></a>
<a href="https://crowdin.com/project/ankidroid"><img src="https://badges.crowdin.net/ankidroid/localized.svg"></img></a>
<a href="https://github.com/ankidroid/Anki-Android/graphs/contributors"><img src="https://img.shields.io/github/contributors/ankidroid/Anki-Android" alt="contributors"/></a>
<a href="https://discord.gg/qjzcRTx"><img src="https://img.shields.io/discord/368267295601983490"></img></a>
<a href="https://github.com/ankidroid/Anki-Android/blob/master/COPYING"><img src="https://img.shields.io/github/license/ankidroid/Anki-Android" alt="license"/></a>
</p>

# AnkiDroid
A semi-official port of the open source [Anki](http://ankisrs.net/index.html) spaced repetition flashcard system to Android. Memorize anything with AnkiDroid!


Wiki
----
View [Wiki](https://github.com/ankidroid/Anki-Android/wiki)

Help
----
Check the [user manual](https://ankidroid.org/docs/manual.html) and the wiki for usage instructions. See the [help page](https://ankidroid.org/docs/help.html) 
for how to submit a bug report or contact a project member, etc.

License
-------
[GPL-3.0 License](https://github.com/ankidroid/Anki-Android/blob/master/COPYING)
[AGPL-3.0 Licence](https://github.com/ankitects/anki/blob/master/LICENSE) for some part of the back-end
