/**
 * 
 */
package com.ctrip.xpipe.redis.metaserver;

import com.ctrip.xpipe.api.lifecycle.Lifecycle;
import com.ctrip.xpipe.redis.keeper.entity.XpipeMeta;

/**
 * @author marsqing
 *
 *         Jun 12, 2016 3:12:56 PM
 */
public interface MetaHolder extends Lifecycle {

	XpipeMeta getMeta();

}
