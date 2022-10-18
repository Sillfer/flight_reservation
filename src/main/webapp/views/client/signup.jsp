<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<title>Sign Up</title>
<jsp:include page="../components/navBar.jsp">
    <jsp:param name="navbar" value="navbar"/>
</jsp:include>
<style>
    .circles {
        position: absolute;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        overflow: hidden;
    }

    .circles li {
        position: absolute;
        display: block;
        list-style: none;
        width: 20px;
        height: 20px;
        background: rgba(255, 255, 255, 0.2);
        animation: animate 25s linear infinite;
        bottom: -150px;
    }

    .circles li:nth-child(1) {
        left: 25%;
        width: 80px;
        height: 80px;
        animation-delay: 0s;
    }


    .circles li:nth-child(2) {
        left: 10%;
        width: 20px;
        height: 20px;
        animation-delay: 2s;
        animation-duration: 12s;
    }

    .circles li:nth-child(3) {
        left: 70%;
        width: 20px;
        height: 20px;
        animation-delay: 4s;
    }

    .circles li:nth-child(4) {
        left: 40%;
        width: 60px;
        height: 60px;
        animation-delay: 0s;
        animation-duration: 18s;
    }

    .circles li:nth-child(5) {
        left: 65%;
        width: 20px;
        height: 20px;
        animation-delay: 0s;
    }

    .circles li:nth-child(6) {
        left: 75%;
        width: 110px;
        height: 110px;
        animation-delay: 3s;
    }

    .circles li:nth-child(7) {
        left: 35%;
        width: 150px;
        height: 150px;
        animation-delay: 7s;
    }

    .circles li:nth-child(8) {
        left: 50%;
        width: 25px;
        height: 25px;
        animation-delay: 15s;
        animation-duration: 45s;
    }

    .circles li:nth-child(9) {
        left: 20%;
        width: 15px;
        height: 15px;
        animation-delay: 2s;
        animation-duration: 35s;
    }

    .circles li:nth-child(10) {
        left: 85%;
        width: 150px;
        height: 150px;
        animation-delay: 0s;
        animation-duration: 11s;
    }

    @keyframes animate {

        0% {
            transform: translateY(0) rotate(0deg);
            opacity: 1;
            border-radius: 0;
        }

        100% {
            transform: translateY(-1000px) rotate(720deg);
            opacity: 0;
            border-radius: 50%;
        }

    }
</style>
<div class="relative max-h-screen flex ">
    <div class="flex flex-col sm:flex-row items-center md:items-start sm:justify-center md:justify-start flex-auto min-w-0">
        <div class="sm:w-1/2 xl:w-3/5 h-screen hidden md:flex flex-auto items-center justify-center p-10 overflow-hidden bg-purple-900 text-white bg-no-repeat bg-cover relative"
             style="background-image: url(
https://assets-us-01.kc-usercontent.com/0542d611-b6d8-4320-a4f4-35ac5cbf43a6/5ce519ef-a3fd-4e1e-baf0-3898d16d0d4c/airplane-insurance-header.jpg?w=1110&h=400&fit=crop);">
            <div class="absolute bg-gradient-to-b from-orange-600 to-amber-700 opacity-75 inset-0 z-0"></div>
            <div class="w-full  max-w-md z-10">
                <div class="sm:text-4xl xl:text-5xl font-bold leading-tight mb-6">Welcome to Reda Airlines</div>
                <div class="sm:text-sm xl:text-md text-gray-200 font-normal"> What is Lorem Ipsum Lorem Ipsum is simply
                    dummy
                    text of the printing and typesetting industry Lorem Ipsum has been the industry's standard dummy
                    text ever
                    since the 1500s when an unknown printer took a galley of type and scrambled it to make a type
                    specimen book it
                    has?
                </div>
            </div>
            <!---remove custom style-->
            <ul class="circles">
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
            </ul>
        </div>
        <div class="md:flex md:items-center md:justify-center w-full sm:w-auto md:h-full w-2/5 xl:w-2/5 p-8  md:p-10 lg:p-14 sm:rounded-lg md:rounded-none shadow">
            <div class="max-w-md w-full space-y-8">
                <div class="text-center">
                    <h2 class="mt-6 text-3xl font-bold text-gray-900">
                        Welcome Among Us
                    </h2>
                    <p class="mt-2 text-sm text-gray-500">Please fill in your information</p>
                </div>
                <div class="flex items-center justify-center space-x-2">
                    <span class="h-px w-16 bg-gray-200"></span>
                    <span class="text-gray-300 font-normal">sign in</span>
                    <span class="h-px w-16 bg-gray-200"></span>
                </div>
                <form class="mt-5 space-y-5" action="#" method="POST">
                    <div class="relative">
                        <label class="ml-3 text-sm font-bold text-gray-700 tracking-wide">First Name
                            <input
                                    class=" w-full text-base px-4 py-2 border-b border-gray-300 focus:outline-none rounded-2xl focus:border-indigo-500"
                                    type="text" placeholder="First Name" name="firstName">
                        </label>
                    </div>
                    <div class="relative">
                        <label class="ml-3 text-sm font-bold text-gray-700 tracking-wide">Last Name
                            <input
                                    class=" w-full text-base px-4 py-2 border-b border-gray-300 focus:outline-none rounded-2xl focus:border-indigo-500"
                                    type="text" placeholder="Last Name" name="lastName">
                        </label>
                    </div>
                    <div class="relative">
                        <label class="ml-3 text-sm font-bold text-gray-700 tracking-wide">Phone Number
                            <input
                                    class=" w-full text-base px-4 py-2 border-b border-gray-300 focus:outline-none rounded-2xl focus:border-indigo-500"
                                    type="text" placeholder="Phone Number" name="phonePassager">
                        </label>
                    </div>
                    <div class="relative">
                        <label class="ml-3 text-sm font-bold text-gray-700 tracking-wide">Email
                            <input
                                    class=" w-full text-base px-4 py-2 border-b border-gray-300 focus:outline-none rounded-2xl focus:border-indigo-500"
                                    type="email" placeholder="Email" name="emailPassager">
                        </label>
                    </div>
                    <div class="mt-8 content-center">
                        <label class="ml-3 text-sm font-bold text-gray-700 tracking-wide">Password
                            <input
                                    class="w-full content-center text-base px-4 py-2 border-b rounded-2xl border-gray-300 focus:outline-none focus:border-indigo-500"
                                    type="password" placeholder="Enter your password" name="passwordPassager">
                        </label>
                    </div>
                    <div class="flex items-center justify-between">

                    </div>
                    <div>
                        <button type="submit"
                                class="w-full flex justify-center bg-gradient-to-r from-orange-500 to-amber-600  hover:bg-gradient-to-l hover:from-amber-500 hover:to-orange-500 text-gray-100 p-4  rounded-full tracking-wide font-semibold  shadow-lg cursor-pointer transition ease-in duration-500">
                            Sign in
                        </button>
                    </div>
                    <p class="flex flex-col items-center justify-center mt-10 text-center text-md text-gray-500">
                        <span>Already have an account?</span>
                        <a href="login.client"
                           class="text-orange-500 hover:text-amber-600 no-underline hover:underline cursor-pointer transition ease-in duration-300">Login
                        </a>
                    </p>
                </form>
            </div>
        </div>
    </div>
</div>

