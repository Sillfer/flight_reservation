<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="./views/components/navBar.jsp">
    <jsp:param name="navbar" value="navbar"/>
</jsp:include>
<!-- component -->


<div class="h-5/6 flex items-center mt-20">
    <div class="hidden lg:flex w-full lg:w-1/2 login_img_section
          justify-around items-center">
        <img src="https://cdn.pixabay.com/photo/2013/07/13/13/20/plane-160861__340.png" alt="" class="w-full">
    </div>
    <div class="flex w-full lg:w-1/2 justify-center items-center  space-y-8">
        <div class="mx-auto w-full max-w-[550px]">
            <form action="showFlights.client" method="POST">
                <div class="-mx-3 flex flex-wrap">
                    <div class="w-full px-3 sm:w-1/2">
                        <div class="mb-5">
                            <label

                                    class="mb-3 block text-base font-medium text-[#07074D]"
                            >
                                Departure City <span class="text-red-500">*</span>
                            </label>
                            <input
                                    type="text"
                                    name="villeDepart"
                                    placeholder="Departure City"
                                    class="w-full rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-base font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md"
                                    required
                            />
                        </div>
                    </div>
                    <div class="w-full px-3 sm:w-1/2">
                        <div class="mb-5">
                            <label

                                    class="mb-3 block text-base font-medium text-[#07074D]"
                            >
                                Arrival City <span class="text-red-500">*</span>
                            </label>
                            <input
                                    type="text"
                                    name="villeArrivee"
                                    placeholder="Arrival City"
                                    class="w-full rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-base font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md"
                                    required
                            />
                        </div>
                    </div>
                </div>

                <div class="w-full  ">
                    <div class="mb-5 w-full">
                        <label

                                class="w-full mb-3 block text-base font-medium text-[#07074D]"
                        >
                            Depart Time <span class="text-red-500">*</span>
                        </label>
                        <input
                                type="datetime-local"
                                name="heureDepart"
                                required
                                class="w-full rounded-md border border-[#e0e0e0] bg-white py-3  text-base font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md"
                        />
                    </div>
                </div>

                <div>
                    <button type="submit"
                            class="w-full flex justify-center bg-gradient-to-r from-blue-500 to-indigo-600  hover:bg-gradient-to-l hover:from-indigo-500 hover:to-blue-500 text-gray-100 p-4  rounded-md tracking-wide font-semibold  shadow-lg cursor-pointer transition ease-in duration-500"
                    >
                        Submit
                    </button>
                </div>
            </form>
        </div>

    </div>
</div>