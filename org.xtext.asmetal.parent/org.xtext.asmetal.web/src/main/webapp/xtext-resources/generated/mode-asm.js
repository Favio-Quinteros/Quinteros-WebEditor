define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		var keywords = "Agent|Bag|Boolean|COMPASSION|CTL|CTLSPEC|Char|Complex|INVAR|Integer|JUSTICE|LTL|LTLSPEC|Map|Natural|Powerset|Prod|Real|Reserve|Rule|Seq|String|Undef|abstract|agent|and|anydomain|asm|asyncr|basic|case|choose|controlled|default|definitions|derived|do|domain|dynamic|else|endif|enditerate|endlet|endpar|endseq|endswitch|enum|exist|export|extend|false|for|forall|function|if|iff|ifnone|implies|import|in|init|invariant|iterate|let|local|macro|main|mod|module|monitored|not|or|otherwise|out|over|par|rule|seq|shared|signature|skip|static|subsetof|switch|then|true|turbo|undef|unique|while|whilerec|with|xor";
		this.$rules = {
			"start": [
				{token: "comment", regex: "\\/\\/.*$"},
				{token: "comment", regex: "\\/\\*", next : "comment"},
				{token: "string", regex: '["](?:(?:\\\\.)|(?:[^"\\\\]))*?["]'},
				{token: "string", regex: "['](?:(?:\\\\.)|(?:[^'\\\\]))*?[']"},
				{token: "constant.numeric", regex: "[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?\\b"},
				{token: "lparen", regex: "[\\[({]"},
				{token: "rparen", regex: "[\\])}]"},
				{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
			],
			"comment": [
				{token: "comment", regex: ".*?\\*\\/", next : "start"},
				{token: "comment", regex: ".+"}
			]
		};
	};
	oop.inherits(HighlightRules, mTextHighlightRules.TextHighlightRules);
	
	var Mode = function() {
		this.HighlightRules = HighlightRules;
	};
	oop.inherits(Mode, mText.Mode);
	Mode.prototype.$id = "xtext/asm";
	Mode.prototype.getCompletions = function(state, session, pos, prefix) {
		return [];
	}
	
	return {
		Mode: Mode
	};
});
