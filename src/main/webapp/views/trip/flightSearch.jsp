<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../components/navBar.jsp">
    <jsp:param name="navbar" value="navbar"/>
</jsp:include>

<!-- component -->
<div class="flex flex-wrap content-start gap-y-4 justify-around min-h-screen bg-center bg-cover mt-20">
    <c:forEach items="${trips}" var="t">

        <form action="reserve.flight" method="post">
            <div class="max-w-lg w-full h-full mb-5  z-10 bg-blue-900 rounded-3xl">
                <div class="flex flex-col justify-around flex-wrap">
                    <div class="bg-white relative drop-shadow-2xl  rounded-3xl p-4 m-4">
                        <div class="flex-none sm:flex">
                            <div class=" relative h-32 w-32   sm:mb-0 mb-3 hidden">
                                <img src="https://tailwindcomponents.com/storage/avatars/njkIbPhyZCftc4g9XbMWwVsa7aGVPajYLRXhEeoo.jpg"
                                     alt="aji" class=" w-32 h-32 object-cover rounded-2xl">
                                <a href="#"
                                   class="absolute -right-2 bottom-2   -ml-3  text-white p-1 text-xs bg-green-400 hover:bg-green-500 font-medium tracking-wider rounded-full transition ease-in duration-300">
                                    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="currentColor"
                                         class="h-4 w-4">
                                        <path
                                                d="M13.586 3.586a2 2 0 112.828 2.828l-.793.793-2.828-2.828.793-.793zM11.379 5.793L3 14.172V17h2.828l8.38-8.379-2.83-2.828z">
                                        </path>
                                    </svg>
                                </a>
                            </div>
                            <div class="flex-auto justify-evenly">
                                <div class="flex">
                                    <div class="flex items-center  my-1">
								<span class="mr-3 rounded-full bg-white w-8 h-8">
    <img src="https://image.winudf.com/v2/image1/Y29tLmJldHMuYWlyaW5kaWEudWlfaWNvbl8xNTU0NTM4MzcxXzA0Mw/icon.png?w=&amp;fakeurl=1"
         class="h-8 p-1">
</span>
                                        <h2 class="font-medium">Reda Airlines</h2>
                                    </div>
                                    <div class="ml-auto text-blue-800">A380</div>
                                </div>
                                <div class="border-b border-dashed border-b-2 my-5"></div>
                                <div class="flex items-center">
                                    <div class="flex flex-col">
                                        <input hidden name="villeDepart" value="${t.villeDepart}">
                                        <div class="w-full flex-none text-lg text-blue-800 font-bold leading-none">${t.villeDepart}</div>
                                        <div class="text-xs">Ville Depart</div>

                                    </div>
                                    <div class="flex flex-col mx-auto">
                                        <img src="https://image.winudf.com/v2/image1/Y29tLmJldHMuYWlyaW5kaWEudWlfaWNvbl8xNTU0NTM4MzcxXzA0Mw/icon.png?w=&amp;fakeurl=1"
                                             class="w-20 p-1">

                                    </div>
                                    <div class="flex flex-col ">
                                        <input hidden name="villeArrivee" value="${t.villeArrivee}">
                                        <div class="w-full flex-none text-lg text-blue-800 font-bold leading-none">${t.villeArrivee}</div>
                                        <div class="text-xs">Ville Arrivee</div>

                                    </div>
                                </div>
                                <div class="border-b border-dashed border-b-2 my-5 pt-5">
                                    <div class="absolute rounded-full w-5 h-5 bg-blue-900 -mt-2 -left-2"></div>
                                    <div class="absolute rounded-full w-5 h-5 bg-blue-900 -mt-2 -right-2"></div>
                                </div>
                                <div class="flex items-center mb-5 p-5 text-sm">
                                    <div class="flex flex-col">
                                        <span class="text-sm">Flight</span>
                                        <div class="font-semibold">Airbus380</div>

                                    </div>
                                    <div class="flex flex-col ml-auto">
                                        <span class="text-sm">Gate</span>
                                        <div class="font-semibold">B3</div>

                                    </div>
                                </div>
                                <div class="flex items-center mb-4 px-5">
                                    <div class="flex flex-col text-sm">
                                        <span class="">Departs</span>
                                        <div class="font-semibold">
                                            <input hidden name="dateDepart" value="${t.dateDepart}">
                                            ${t.dateDepart}
                                        </div>

                                    </div>
                                    <div class="flex flex-col text-sm mx-auto">
                                        <span class="">Price</span>
                                        <div class="font-semibold">
                                            <input hidden name="priceTrip" value="${t.priceTrip}">
                                            ${t.priceTrip}
                                        </div>

                                    </div>
                                    <div class="flex flex-col text-sm ">
                                        <span class="">Arrived</span>
                                        <div class="font-semibold">
                                            <input hidden name="dateArrivee" value="${t.dateArrivee}">
                                            ${t.dateArrivee}
                                        </div>

                                    </div>
                                </div>
                                <div class="border-b border-dashed border-b-2 my-5 pt-5">
                                    <div class="absolute rounded-full w-5 h-5 bg-blue-900 -mt-2 -left-2"></div>
                                    <div class="absolute rounded-full w-5 h-5 bg-blue-900 -mt-2 -right-2"></div>
                                </div>
                                <div class="flex justify-center px-5 text-sm">

                                    <input type="hidden" name="idTrip" value="${t.idTrip}">
                                    <button type="submit"
                                            class="text-blue-800 border border-blue-800 hover:bg-blue-800 hover:text-white active:bg-blue-900 font-bold uppercase px-8 py-3 rounded outline-none focus:outline-none mr-1 mb-1 ease-linear transition-all duration-150">
                                        Reserve
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </form>

    </c:forEach>
</div>
<jsp:include page="../components/footer.jsp">
    <jsp:param name="footer" value="footer"/>
</jsp:include>

