# WebView Local Server

## 使用方式

```Java
//资源文件域名
final X5WebViewLocalServer assetServer = new X5WebViewLocalServer(this,
                "game-static.new.tongzhuogame.com");
//本地资源路径和网络资源路径
assetServer.hostStorage(PathUtils.getExternalFilesDir(this, "single"),
                "/debug/MagicBrick/single");

mWebView.setWebViewClient(new WebViewClient() {
	// For KitKat and earlier.
	@Override
	public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
		return assetServer.shouldInterceptRequest(url);
	}

	// For Lollipop and above.
	@TargetApi(Build.VERSION_CODES.LOLLIPOP)
	public WebResourceResponse shouldInterceptRequest(WebView view,
			WebResourceRequest request) {
		return assetServer.shouldInterceptRequest(request);
	}
});

mWebView.loadUrl(url);
```

例如：https://game-static.new.tongzhuogame.com/debug/MagicBrick/single/index.html, 域名为：game-static.new.tongzhuogame.com，路径为/debug/MagicBrick/single

## 提高安全性

```Java
webView.getSettings().setAllowFileAccessFromFileURLs(false);
webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
webView.getSettings().setAllowFileAccess(false);
webView.getSettings().setAllowContentAccess(false);
```