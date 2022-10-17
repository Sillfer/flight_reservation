<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome to Reda Airlines</title>

</head>
<body>
<jsp:include page="./views/components/navBar.jsp">
    <jsp:param name="navbar" value="navbar"/>
</jsp:include>
<!-- component -->

<div class="h-5/6 flex">
    <div class="hidden lg:flex w-full lg:w-1/2 login_img_section
          justify-around items-center">
        <img src="https://cdn.pixabay.com/photo/2013/07/13/13/20/plane-160861__340.png" alt="" class="w-full">
    </div>
    <div class="flex w-full lg:w-1/2 justify-center items-center  space-y-8">
        <div class="mx-auto w-full max-w-[550px]">
            <form action="https://formbold.com/s/FORM_ID" method="POST">
                <div class="mb-5">
                    <label class="mb-3 block text-base font-medium text-[#07074D]">
                        Type of Flight <span class="text-red-500">*</span>
                    </label>
                    <div class="flex items-center space-x-6">
                        <div class="flex items-center">
                            <input
                                    type="radio"
                                    name="radio1"
                                    id="one-way"
                                    class="h-5 w-5"
                            />
                            <label
                                    for="one-way"
                                    class="pl-3 text-base font-medium text-[#07074D]"
                            >
                                One Way
                            </label>
                        </div>
                        <div class="flex items-center">
                            <input
                                    type="radio"
                                    name="radio1"
                                    id="round-trip"
                                    class="h-5 w-5"
                            />
                            <label
                                    for="round-trip"
                                    class="pl-3 text-base font-medium text-[#07074D]"
                            >
                                Round Trip
                            </label>
                        </div>
                    </div>
                </div>
                <div class="-mx-3 flex flex-wrap">
                    <div class="w-full px-3 sm:w-1/2">
                        <div class="mb-5">
                            <label
                                    for="fName"
                                    class="mb-3 block text-base font-medium text-[#07074D]"
                            >
                                Departure City <span class="text-red-500">*</span>
                            </label>
                            <input
                                    type="text"
                                    name="fName"
                                    id="fName"
                                    placeholder="Departure City"
                                    class="w-full rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-base font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md"
                                    required
                            />
                        </div>
                    </div>
                    <div class="w-full px-3 sm:w-1/2">
                        <div class="mb-5">
                            <label
                                    for="lName"
                                    class="mb-3 block text-base font-medium text-[#07074D]"
                            >
                                Arrival City <span class="text-red-500">*</span>
                            </label>
                            <input
                                    type="text"
                                    name="lName"
                                    id="lName"
                                    placeholder="Arrival City"
                                    class="w-full rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-base font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md"
                                    required
                            />
                        </div>
                    </div>
                </div>
                <div class="mb-5">
                    <label
                            for="guest"
                            class="mb-3 block text-base font-medium text-[#07074D]"
                    >
                        How many guest are you bringing? <span class="text-red-500">*</span>
                    </label>
                    <input
                            type="number"
                            name="guest"
                            id="guest"
                            placeholder="5"
                            min="0"
                            class="w-full appearance-none rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-base font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md"
                    />
                </div>

                <div class="-mx-3 flex flex-wrap">
                    <div class="w-full px-3 sm:w-1/2">
                        <div class="mb-5">
                            <label
                                    for="dateDeparture"
                                    class="mb-3 block text-base font-medium text-[#07074D]"
                            >
                                Date of Departure <span class="text-red-500">*</span>
                            </label>
                            <input
                                    type="date"
                                    name="dateDeparture"
                                    id="dateDeparture"
                                    required
                                    class="w-full rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-base font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md"
                            />
                        </div>
                    </div>
                    <div class="w-full px-3 sm:w-1/2">
                        <div class="mb-5">
                            <label
                                    for="dateReturn"
                                    class="mb-3 block text-base font-medium text-[#07074D]"
                            >
                                Date of Return <span class="text-red-500">*</span>
                            </label>
                            <input
                                    type="date"
                                    name="dateReturn"
                                    id="dateReturn"
                                    class="w-full rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-base font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md"
                            />
                        </div>
                    </div>
                </div>

                <div>
                    <button
                            class="hover:shadow-form rounded-md bg-[#6A64F1] py-3 px-8 text-center text-base font-semibold text-white outline-none"
                    >
                        Submit
                    </button>
                </div>
            </form>
        </div>

    </div>
</div>

</body>
</html>