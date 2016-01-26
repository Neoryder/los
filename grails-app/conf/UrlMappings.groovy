class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

//		"/"(view:"/index")
		"/"(view:"/landingPage")
		"/landingPage"(view:"/landingPage")
		"500"(view:'/error')
	}
}
