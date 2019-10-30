package kr.co.shineware.nlp.elasticsearch.plugin;

import kr.co.shineware.nlp.elasticsearch.index.KomoranTokenizerFactory;
import org.elasticsearch.index.analysis.TokenizerFactory;
import org.elasticsearch.indices.analysis.AnalysisModule;
import org.elasticsearch.plugins.AnalysisPlugin;

import java.util.Map;

import static java.util.Collections.emptyMap;
import static java.util.Collections.singletonMap;

public class KomoranPlugin implements AnalysisPlugin {

    @Override
    public Map<String, AnalysisModule.AnalysisProvider<TokenizerFactory>> getTokenizers() {
        return singletonMap("komoran_tokenizer", KomoranTokenizerFactory::new);
    }

}
