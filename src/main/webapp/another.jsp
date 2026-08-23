<% if (request.getAttribute("activeMenu") == null) request.setAttribute("activeMenu", "another"); %>
<%@ include file="includes/header.jsp" %>

    <main class="flex-1 flex items-center justify-center p-6 my-8">
        <div class="max-w-md w-full glass-card rounded-2xl shadow-2xl p-8 space-y-6">
            <div class="text-center space-y-2">
                <span class="inline-block px-3 py-1 text-xs font-semibold uppercase tracking-wider text-purple-400 bg-purple-950/80 rounded-full border border-purple-500/30 badge-glow-purple">
                    Jakarta EE Servlet &amp; Decorator
                </span>
                <h1 class="text-3xl font-extrabold text-white tracking-tight">
                    ${message}
                </h1>
            </div>

            <div class="bg-slate-900/80 rounded-xl p-5 border border-slate-700/50 space-y-2 text-center">
                <p class="text-sm font-medium text-slate-400 uppercase tracking-wider">Generated Number (Decorated)</p>
                <p class="text-xl mono-number font-bold text-purple-400 break-all">
                    ${number}
                </p>
            </div>

            <div class="pt-2 flex flex-col gap-3 text-center">
                <a href="index.jsp" class="btn-transition w-full inline-flex justify-center items-center px-4 py-2.5 rounded-lg text-sm font-medium text-white bg-purple-600 hover:bg-purple-500 transition-colors shadow-lg shadow-purple-600/20">
                    Back to Home
                </a>
                <a href="hello-servlet" class="btn-transition w-full inline-flex justify-center items-center px-4 py-2.5 rounded-lg text-sm font-medium text-slate-300 bg-slate-700/50 hover:bg-slate-700 transition-colors border border-slate-600/50">
                    Go to Hello Servlet
                </a>
            </div>
        </div>
    </main>

<%@ include file="includes/footer.jsp" %>
