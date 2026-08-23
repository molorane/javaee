<% request.setAttribute("activeMenu", "home"); %>
<%@ include file="includes/header.jsp" %>

    <div class="max-w-4xl mx-auto w-full px-6 py-12 space-y-12">
        <!-- Hero Header -->
        <header class="text-center space-y-4">
            <div class="inline-flex items-center gap-2 px-3.5 py-1.5 rounded-full bg-indigo-950/80 border border-indigo-500/30 text-indigo-400 text-xs font-semibold uppercase tracking-wider badge-glow-indigo">
                <span class="w-2 h-2 rounded-full bg-indigo-400 animate-pulse"></span>
                Jakarta EE &amp; CDI Demo
            </div>
            <h1 class="text-4xl sm:text-5xl font-extrabold text-white tracking-tight">
                Number Generator Services
            </h1>
            <p class="text-slate-400 max-w-xl mx-auto text-base sm:text-lg">
                Explore CDI injection, qualifier bindings, interceptors, and decorators in action.
            </p>
        </header>

        <!-- Feature Cards Grid -->
        <main class="grid grid-cols-1 md:grid-cols-2 gap-6">
            <!-- Hello Servlet Card -->
            <a href="hello-servlet" class="group block glass-card btn-transition rounded-2xl p-6 hover:border-indigo-500/50 transition-all duration-200 shadow-xl hover:shadow-indigo-500/10">
                <div class="flex items-center justify-between mb-4">
                    <span class="px-3 py-1 text-xs font-medium text-indigo-300 bg-indigo-900/50 rounded-md border border-indigo-700/40">
                        @ThirteenDigits
                    </span>
                    <svg class="w-5 h-5 text-slate-500 group-hover:text-indigo-400 group-hover:translate-x-1 transition-all" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M14 5l7 7m0 0l-7 7m7-7H3"/>
                    </svg>
                </div>
                <h2 class="text-xl font-bold text-white group-hover:text-indigo-300 transition-colors">
                    Hello Servlet
                </h2>
                <p class="text-slate-400 text-sm mt-2 leading-relaxed">
                    Uses ISBN 13-digit generator with custom interceptor logging enabled.
                </p>
                <div class="mt-6 flex items-center text-xs font-semibold text-indigo-400 group-hover:underline">
                    Launch Servlet &rarr;
                </div>
            </a>

            <!-- Another Servlet Card -->
            <a href="another-servlet" class="group block glass-card btn-transition rounded-2xl p-6 hover:border-purple-500/50 transition-all duration-200 shadow-xl hover:shadow-purple-500/10">
                <div class="flex items-center justify-between mb-4">
                    <span class="px-3 py-1 text-xs font-medium text-purple-300 bg-purple-900/50 rounded-md border border-purple-700/40">
                        @EightDigits + Decorator
                    </span>
                    <svg class="w-5 h-5 text-slate-500 group-hover:text-purple-400 group-hover:translate-x-1 transition-all" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M14 5l7 7m0 0l-7 7m7-7H3"/>
                    </svg>
                </div>
                <h2 class="text-xl font-bold text-white group-hover:text-purple-300 transition-colors">
                    Another Servlet
                </h2>
                <p class="text-slate-400 text-sm mt-2 leading-relaxed">
                    Uses ISSN 8-digit generator enhanced by a CDI Decorator into 13 digits.
                </p>
                <div class="mt-6 flex items-center text-xs font-semibold text-purple-400 group-hover:underline">
                    Launch Servlet &rarr;
                </div>
            </a>
        </main>
    </div>

<%@ include file="includes/footer.jsp" %>