Plugin.PluginView = {};

Plugin.PluginView.init = function () {
	AJS.$('#main-container').html(plugin.tpl.pluginview.render());
}